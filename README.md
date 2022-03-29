# ÜbunGszettel TDD

# Aufgabe 1: Theorie

Arbeite dich in die Theorie zum Thema Testen bzw. Test-Driven-Development (TDD) ein. Nutze dazu die Materialien aus den verschiedenen „Input&quot; Abschnitten im Themenbereich „Test-Driven Development&quot; unseres Moodle-Kurses (https://moodle.tsn.at/course/view.php?id=24763#section-8). Nach dieser Aufgabe musst du folgende Punkte erklären können:

- Testdriven Development

    - Ein vorgehen, welches den Output definiert und den Code danach testet. Sollte der Output falsch sein wird der code so lange umgeschrieben bis das richtige testresultat herauskommt
- Red-Green-Refactor
  - Man schreibt zuerst einen Test der mit 100%iger Wahrscheinlichkeit fehlschlägt.
  - Dann sorgt man dafür, dass der Tests erfolgreich wird indem man den code umschreibt
  - Dann reefractored man den Code, macht ihn schneller etc und bei der nächsten Aufgabe genau das Gleiche neuer test der failed code umschreiben bis er passed und dann optimieren usw…


![download](https://user-images.githubusercontent.com/46607383/160693290-8266ba07-9cac-406f-bd53-1fd09e77c4a0.png)


- FIRST-Acronym
  -
- Kent Beck (welche Rolle spielt er in Bezug auf TDD)
  - Er gilt als Erfinder von SUnit das dann zu JUnit wurde. Also sozusagen der Vater des TDD
- Testarten
  - Unit-Tests (Sociable, Solitary, Mocks)
    - Modul/Komponententests tests eines isolierten Programmbausteines also zum Beispiel einer Klasse oder Methode
  - Integrationstests
    - Test des korrekten Zusammenspiels mehrerer Programmbausteine die jeweils unit tests unterzogen wurden
  - UI-Tests / End-To-End Tests / Systemtests
    - Test auf Funktionsfähigkeit des gesamten Systems entsprecheend der Anforderung, reiner Black-Box-Test, zusätzliche Tests wwie Performance Robustheit etc…
  - Akzeptanztests
    - Unter Zielumgebung und echten Einsatzbedingungen. Tests auf erwartung des Anwewnders/Kunden
- Testpyramide

![](RackMultipart20220329-4-b5txds_html_bf99eb310eefb2eb.png)

  - Eine Regel über tests sozusagen
  - Bei Unit tests ganz viele machen, weil es dort gut geht und der Aufwand und die Ausführungsdauer sehr gering ist.
  - Und bei Akzeptanztests weniger tests, da es sehr aufwendig ist und eine hohe Ausführungsdauer hat
- JUNIT (Junit5)
  - JUnit is a Java unit testing framework that&#39;s one of the best test methods for regression testing. An open-source framework, it is used to write and run repeatable automated tests.
- Mockito (Sinn und Funktionsweise von Mocking-Bibliotheken)
  - Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA applications. Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface that can be used in unit testing.

# Aufgabe 2: Ausgangsprojekt

Laden Sie sich das gegebene Maven-Ausgangsprojekt („TDD Kino Demo&quot;, siehe Moodle) herunter. Laden Sie es als Maven-Projekt in ihre IDE und schauen Sie sich an, wie das Projekt aufgebaut ist:

- pom.xml (Dependencies, Java-Version etc.)
- Gegebene Domänen-Klassen (Kinosaal, Ticket etc.)
- Gegebene Start-Junit5-Tests in test /java/at.itkolleg/AppTest

Starten Sie den Test AppTest über den grünen Pfeil und versichern Sie sich, dass alles korrekt läuft. Starten Sie auch die App (main-Methode).

# Aufgabe 3: Einarbeitung in den gegebenen Code

Arbeiten Sie sich in den gegebenen Code zur Kinoverwaltung ein. Verwenden Sie die gegebenen Klassen KinoSaal, Ticket, Vorstellung, Kinoverwaltung in der App-Klasse (main-Methode), um ein Gefühl für die Funktionsweise des Programms zu bekommen. Führen Sie folgende Punkte durch:

- Kinosäle anlegen check
- Vorstellungen anlegen check
- Vorstellungen über die Kinoverwaltung einplanen check
- Tickets für Vorstellungen ausgeben
- etc.

# Aufgabe 4: JUNIT-Tests für KinoSaal

Testen Sie alle Methoden der Klasse KinoSaal (Testklasse TestKinoSaal). check

# Aufgabe 5: JUNIT-Tests für Vorstellung

Testen Sie alle Methoden der Klasse Vorstellung (Testklasse TestVorstellung). check

# Aufgabe 6: JUNIT-Tests für KinoVerwaltung

Testen Sie alle Methoden der Klasse KinoVerwaltung (Testklasse TestKinoverwaltung). check

# Aufgabe 7: JUNIT-Tests Advanced

Falls nicht schon in den vorhergehenden Aufgaben passiert, testen Sie folgende Punkte unter Verwendung der fortgeschrittenen Features von JUNIT 5:

1. Schreiben Sie einen Test, der validiert, dass das Anlegen einer Vorstellung korrekt funktioniert. Der Test sollte eine fachliche Bezeichnung haben und die Assertions sollten bei Validierungsfehler eine Hinweistext liefern.
2. Schreiben Sie einen Test, der validiert, dass das Einplanen mehrerer Vorstellungen korrekt funktioniert. Stellen Sie zudem sicher, dass beim möglichen Auftreten eines Fehlers trotzdem alle Validierungen ausgeführt werden.
3. Schreiben Sie einen Test, der sicherstellt, dass ein Fehler geworfen wird, wenn eine Veranstaltung doppelt eingeplant wird.
4. Schreiben Sie einen parametrisierten Test, der mehrere Ticketkäufe mit unterschiedlichen Parametern überprüft.
5. Schreiben Sie eine dynamische TestFactory die den Ticketkauf mit zufälligen Werten bombardiert. Der Test soll sicherstellen, dass der Ticketkauf entweder funktioniert oder nur einen der definierten Fehlermeldungen (z.B. new IllegalArgumentException(&quot;Nicht ausreichend Geld.&quot;)) ausgibt. Die Tests müssen reproduzierbar sein.

# Aufgabe 8: Mockito Einführung

Lesen Sie sich in das Mocking-Framework Mockito ein (Links siehe Moodle im Abschitt „Input zu Mockito&quot;).

Verwenden Sie die wesentlichen Mockito-Möglichkeiten praktisch in kleinen Programmen.

