package com.example.Exam_200525;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Logger;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {



		ArrayList<Evento> listaTodosEventos = new ArrayList<>();


		try (BufferedReader bufferReader = new BufferedReader(new FileReader("eventos.txt"))) {
			String linea;
			while ((linea = bufferReader.readLine()) != null) {
				String[] partes = linea.split(",", 4);
				if (partes.length == 4) {
					String nombre = partes[0];
					LocalDateTime fecha = LocalDateTime.parse(partes[1]);
					String ubicacion = partes[2];
					String descripcion = partes[3];
					listaTodosEventos.add(new Evento(nombre, fecha, ubicacion, descripcion));
				}
			}

			logger.info("Archivo 'eventos.txt' leído correctamente.");

		} catch (IOException e) {
			System.out.println("Se ha producido un error" + e.getMessage());
		}

		Evento eventoPrimero = new Evento();
		eventoPrimero.setNombre("Concierto de Il Divo");
		eventoPrimero.setFecha(LocalDateTime.of(2025, 6, 19, 22, 00));
		eventoPrimero.setUbicacion("Madrid");
		eventoPrimero.setDescripcion("Teatro Real");

		Evento eventoSegundo = new Evento();
		eventoSegundo.setNombre("Concierto de La Oreja de Van Gogh");
		eventoSegundo.setFecha(LocalDateTime.of(2025, 8, 17, 22, 30));
		eventoSegundo.setUbicacion("Madrid");
		eventoSegundo.setDescripcion("Estadio Santiago Bernabeu");

		Evento eventoTercero = new Evento();
		eventoTercero.setNombre("Concierto de Depeche Mode");
		eventoTercero.setFecha(LocalDateTime.of(2025, 9, 23, 19, 45));
		eventoTercero.setUbicacion("Barcelona");
		eventoTercero.setDescripcion("Estadi Nou Camp Nou");

		listaTodosEventos.add(eventoPrimero);
		listaTodosEventos.add(eventoSegundo);
		listaTodosEventos.add(eventoTercero);


		try (BufferedWriter bufferWriter = new BufferedWriter(
				new FileWriter("salida_eventos.txt"))) {
			for (Evento e : listaTodosEventos) {
				bufferWriter
						.write(e.getNombre() + "," + e.getFecha() + "," + e.getUbicacion() + "," + e.getDescripcion());
				bufferWriter.newLine();
			}
			System.out.println("El archivo 'salida_eventos.txt' se ha generado con éxito.");
			logger.info("El archivo 'salida_eventos.txt' se ha generado con éxito.");
		} catch (IOException e) {
			System.out.println("Se ha producido un error escribiendo este archivo: " + e.getMessage());
		}


		XSSFWorkbook libro = new XSSFWorkbook();


		XSSFSheet hoja = libro.createSheet("eventos s.a");



		XSSFRow fila0 = hoja.createRow(0);
		fila0.createCell(0).setCellValue("Nombre");
		fila0.createCell(1).setCellValue("Fecha");
		fila0.createCell(2).setCellValue("Ubicación");
		fila0.createCell(3).setCellValue("Descripción");

		int numFilas = 1;
		for (Evento e : listaTodosEventos) {
			XSSFRow fila = hoja.createRow(numFilas++);
			fila.createCell(0).setCellValue(e.getNombre());
			fila.createCell(1).setCellValue(e.getFecha().toString());
			fila.createCell(2).setCellValue(e.getUbicacion());
			fila.createCell(3).setCellValue(e.getDescripcion());
		}

		try (FileOutputStream out = new FileOutputStream("eventos.xlsx")) {
			libro.write(out);
			libro.close();
			System.out.println("Excel 'eventos.xlsx' generado satisfactoriamente.");
			logger.info("Archivo 'eventos.xlsx' generado satisfactoriamente.");
		} catch (IOException e) {
			System.out.println("Error escribiendo el Excel: " + e.getMessage());
		}

		try {
			String ruta = "resumen_eventos.pdf";
			PdfWriter PDFwriter = new PdfWriter(ruta);
			PdfDocument pdf = new PdfDocument(PDFwriter);
			Document document = new Document(pdf);


			Paragraph titulo = new Paragraph("Lista Resumida de Eventos").setFontSize(18).setBold()
					.setFontColor(ColorConstants.GREEN).setTextAlignment(TextAlignment.CENTER).setMarginBottom(18);
			document.add(titulo);

			
			for (Evento e : listaTodosEventos) {
				String eventoenTexto = "Nombre: " + e.getNombre() + "\n" + "Fecha: " + e.getFecha().toString() + "\n"
						+ "Ubicación: " + e.getUbicacion() + "\n" + "Descripción: " + e.getDescripcion() + "\n\n";

				Paragraph parrafoEvento = new Paragraph(eventoenTexto).setFontSize(10).setMarginBottom(10);
				document.add(parrafoEvento);
			}

			document.close();
			System.out.println("PDF 'resumen_eventos.pdf' generado correctamente.");
			logger.info("Archivo 'resumen_eventos.pdf' generado correctamente.");

		} catch (IOException e) {
			System.out.println("Se ha producido un fallo generando el PDF: " + e.getMessage());
		}


	}


}
