EJERCICIO 1
SELECT AVG(SALARIO), COUNT(COMISION), MAX(SALARIO), MIN(SALARIO) FROM EMPLE WHERE DEPT_NO= 30;
EJERCICIO 2
SELECT TEMA FROM LIBRERIA WHERE EJEMPLARES =(SELECT MAX(EJEMPLARES) FROM LIBRERIA )AND TEMA LIKE ('%E%')
/
EJERCICIO 3
SELECT RPAD (LTRIM (RTRIM (TITULO,'-','^'), ‘‘) 45,'-1') FROM MIS TEXTOS
/
EJERCICIO 4
SELECT LOWER (LTRIM(RTRIM(TITULO,'.'''''),''''))FROM MISTEXTOS
/
EJERCICIO 5
SELECT AUTOR, SUBSTR (AUTOR,0,INSTR(AUTOR, '.' , 1)-1) FROM LIBROS
/
EJERCICIO 6
SELECT AUTOR,SUBSTR(AUTOR,0,INSTR(AUTOR,'.',1)+1)FROM LIBROS
/
EJERCICIO 7
SELECT SUBSTR(AUTOR,INSTR(AUTOR,',',1)+1),SUBSTR(AUTOR,0,INSTR(AUTOR,',',1)-1 ) FROM LIBROS
/
EJERCICIO 8
SELECT TITULO FROM LIBROS ORDER BY LENGTH (TITULO)
/
EJERCICIO 9
SELECT NOMBRE,FECHANAC,TO_CHAR(FECHANAC,'"NACIO EL "dd" DE "month" DE "yyyy"')FROM NACIMIENTOS
/
EJERCICIO 10
SELECT TEMA,SUBSTR(TEMA,INSTR(TEMA,' ')-1),INSTR(TEMA,' ')-1 FROM LIBRERIA ORDER BY TEMA
/
EJERCICIO 11
SELECT NOMBRE,TO_CHAR(FECHANAC,'"NACIO EL,"DD" "MONTH" "YYYY"')FROM NACIMIENTOS
/
EJERCICIO 12
SELECT TO_CHAR (TO_DATE ('010712','DDMMYY'),'MONTH') FROM DUAL
/
EJERCICIO 13
SELECT APELLIDO, TRUNC((SYSDATE-FECHA_ALT) /365)
FROM EMPLE
WHERE TRUNC((SYSDATE - FECHA_ALT) /365) > 15;
EJERCICIO 14
SELECT APELLIDO FROM EMPLE WHERE SYSDATE-TO_NUMBER(TO_CHAR (FECHA_ALT,'YYYY'))>15
/
EJERCICIO 15
SELECT APELLIDO FROM EMPLE WHERE MONTHS_BETWEEN (FECHA_ALT, SYSDATE)>16*15 AND DEPT_NO= (SELECT DEPT_NO FROM DEPART WHERE DNOMBRE='VENTAS')
/
