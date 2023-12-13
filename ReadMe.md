# Deal or No Deal

Dies ist eine Java-Implementierung der beliebten Spielshow "Deal or No Deal". 
Das Spiel beinhaltet 20 Koffer, die jeweils einen unterschiedlichen Geldbetrag im Bereich von 1€ - 250.000€ enthalten. 
Der Spieler wählt einen "Goldenene Koffer" aus, welchen er während der Runden nicht öffnen darf. 
Nach jeder Runde macht die Bank ein Angebot, welches auf den verbleibenden Geldbeträgen und der Anzahl der verbleibenden Koffer basiert.
Der Spieler kann das Angebot annehmen oder weiter Koffer öffnen. 
Wenn alle bis auf einen Koffer geöffnet wurden, kann der Spieler den letzten Koffer behalten oder gegen den "Goldenen Koffer" tauschen.
Der Spieler gewinnt die Summe, die sich in seinem Koffer befindet.

## Funktionen

- **Koffer**: Jeder Koffer hat einen Wert und kann geöffnet werden.
- **Bank**: Die Bank sendet ein Angebot nach jeder Runde und prüft, ob das Angebot angenommen wurde.
- **Tafel**: Die Tafel zeigt die verbleibenden Geldbeträge und Koffer an. Die Werte werden gestrichen, wenn ein Koffer geöffnet wurde.
- **Spiel**: Die Spiel Klasse lässt den Spieler den "Goldenen Koffer" auswählen,  öffnet vom Spieler gewählte Koffer.
- **SpielLauncher**: Leitet die verschiendenen Runden ein
- **Main**: Die Main Klasse startet das Spiel.

## Spielanleitung

1. Wählen Sie den "Goldenen Koffer", der während der Runden nicht geöffnet wird.
2. Öffnen Sie 6 Koffer in der ersten Runde.
3. Öffnen Sie 3 Koffer in der zweiten bis vierten Runde.
4. Öffnen Sie 2 Koffer in der fünften Runde.
5. Öffnen Sie 1 Koffer in der letzten Runde.
6. Nach jeder Runde macht die Bank ein Angebot. Sie können das Angebot annehmen oder weiter Koffer öffnen.
7. Wenn alle bis auf einen Koffer geöffnet wurden, können Sie den letzten Koffer behalten oder gegen den "Goldenen Koffer" tauschen.

## Installation

Dieses Spiel sollte ab Java 12 funtkionieren. 
Nach dem Klonen des Repositorys können Sie das Spiel von der Main-Klasse aus starten.
