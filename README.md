### F1 versenyzők
Néhány F1 versenyző úgy dönt évente tartanak egy autó versenyt. Schumacher, Coultard és Hakkinen azt is elhatározzák, hogy a helyezéseiket minden évben egy szöveges fájlba rögzítik. Az így létrejött szöveges fájl sorai vesszővel elválasztva tartalmazzák a következő adatokat:

```<Schumacher helyezése>, <Coultard helyezése>, <Hakkinen helyezése>, <verseny éve>```

Implementáld a `static String calculateRacerResults(String fileName)` metódust. A `fileName` paraméter a fent említett fájl elérési útját és nevét tartalmazza. A metódus feladata, hogy egy String-et adjon vissza ami a versenyzők legjobb és legrosszabb eredményének évszámait a következő formában tartalmazza:

```<Versenyző neve> => <Legjobb eredmény éve>, <Legrosszabb eredmény éve>```

A vissza adandó String-ben a versenyzőket egy szóközzel kell elválasztani egymástól.
Ha egy versenyző két különböző évben azonos eredményt ért el akkor a korábbi évet kell figyelembe venni.
Például ha a fájl tartalma:
```
1,2,3,1995
6,2,5,1996
10,1,5,1997
3,6,10,1998
3,2,1,1999
3,1,7,2000
3,1,7,2001
7,8,9,2002
```

Akkor a vissza adandó String:

```Schumacher => 1995, 1997 Coultard => 1997, 2002 Hakkinen => 1999, 1998```
