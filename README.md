# pwo-projekt
Zespół: Babinska, Besarab, Veshnevskyi

Temat projektu: Prosta reprezentacja działania abstrakcji w języku Java
Zespół: Natalia Babinska, Władysław Besarab, Vladyslav Veshnevskyi

Plik Geometric.java – autor Natalia Babinska
Pliki Rectangle.java, Square.java – autor Vladyslav Veshnevskyi
Pliki dla testów RectangleTest.java, SquareTest.java – autor Władysław Besarab

Plik Geometric.java – to klasa abstrakcyjna, która reprezentuje figurę z dwoma stronami, ma trzy różne konstruktorzy oraz dwie metody do obliczania pola oraz obwodu figury

Pliki Rectangle.java i Square.java – dwie klasy dziedziczące po Geometric.
Klasa Rectangle ma trzy konstruktorzy, które wywołują super metodę (tzn., konstruktor klasy Geometric), oraz dwie nadpisane (@override) metody do obliczania pola oraz obwodu prostokąta. 
Klasa Square.java ma jeden konstruktor, dwie nadpisane metody do obliczania pola oraz obwodu kwadratu oraz metodę do otrzymania długości strony.

Plik RectangleTest.java zawiera 4 metody dla testowania klasy Rectangle.
W pierwszej metodzie sprawdzamy czy pierwsza z podanych stron (2 i 4) jest równa 2
W drugiej metodzie sprawdzamy czy druga z podanych stron (2 i 4) jest równa 4
W trzeciej metodzie sprawdzamy czy obwód prostokąta ze stronami 2 i 4 jest równe 12
W czwartej metodzie sprawdzamy czy pole prostokąta ze stronami 2 i 4 jest równe 8

Plik SquareTest.java zawiera również 4 metody dla testowania klasy Square.
W pierwszej metodzie sprawdzamy czy strona kwadratu jest równa 2
W drugiej metodzie sprawdzamy czy inna strona kwadratu jest równa 2
W trzeciej metodzie sprawdzamy czy obwód kwadratu jest równy 8
W czwartej metodzie sprawdzamy czy pole kwadratu jest równe 4

