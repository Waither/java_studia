18:45:37.300 [main] INFO ShapeDescriber -- Opis figury:
18:45:37.302 [main] INFO ShapeDescriber -- Typ figury: Rectangle
18:45:37.304 [main] INFO ShapeDescriber -- Pole figury: 6.0
18:45:37.304 [main] INFO ShapeDescriber -- Obwód figury: 10.0
18:45:37.311 [main] INFO ShapeDescriber -- Kolor figury: Red: 128, Green: 0, Blue: 0, Alpha: 0,40

18:45:37.311 [main] INFO ShapeDescriber -- Opis figury:
18:45:37.311 [main] INFO ShapeDescriber -- Typ figury: Triangle
18:45:37.311 [main] INFO ShapeDescriber -- Pole figury: 7.806247497997997
18:45:37.311 [main] INFO ShapeDescriber -- Obwód figury: 13.0
18:45:37.311 [main] INFO ShapeDescriber -- Kolor figury: Red: 255, Green: 128, Blue: 52, Alpha: 0,00

18:45:37.311 [main] INFO ShapeDescriber -- Opis figury:
18:45:37.312 [main] INFO ShapeDescriber -- Typ figury: Rectangle
18:45:37.312 [main] INFO ShapeDescriber -- Pole figury: 25.0
18:45:37.312 [main] INFO ShapeDescriber -- Obwód figury: 20.0
18:45:37.312 [main] INFO ShapeDescriber -- Kolor figury: Red: 0, Green: 255, Blue: 0, Alpha: 0,70

18:45:37.312 [main] INFO ShapeDescriber -- Opis figury:
18:45:37.312 [main] INFO ShapeDescriber -- Typ figury: Triangle
18:45:37.312 [main] INFO ShapeDescriber -- Pole figury: 14.696938456699069
18:45:37.312 [main] INFO ShapeDescriber -- Obwód figury: 18.0
18:45:37.312 [main] INFO ShapeDescriber -- Kolor figury: Red: 0, Green: 0, Blue: 255, Alpha: 0,90

18:45:37.312 [main] INFO ShapeDescriber -- Opis figury:
18:45:37.312 [main] INFO ShapeDescriber -- Typ figury: Rectangle
18:45:37.312 [main] INFO ShapeDescriber -- Pole figury: 60.0
18:45:37.312 [main] INFO ShapeDescriber -- Obwód figury: 31.0
18:45:37.312 [main] INFO ShapeDescriber -- Kolor figury: Red: 255, Green: 255, Blue: 0, Alpha: 0,50

18:45:37.312 [main] INFO ShapeDescriber -- Opis figury:
18:45:37.312 [main] INFO ShapeDescriber -- Typ figury: Triangle
18:45:37.312 [main] INFO ShapeDescriber -- Pole figury: 24.0
18:45:37.312 [main] INFO ShapeDescriber -- Obwód figury: 24.0
18:45:37.312 [main] INFO ShapeDescriber -- Kolor figury: Red: 128, Green: 128, Blue: 128, Alpha: 1,00

Rysowanie figury:
Typ figury: Rectangle
Kolor figury: Red: 128, Green: 0, Blue: 0, Alpha: 0,40

Reprezentacja graficzna:
* *
* *
* *


Rysowanie figury:
Typ figury: Triangle
Kolor figury: Red: 255, Green: 128, Blue: 52, Alpha: 0,00

Reprezentacja graficzna:
  * *
 * * * 
* * * * * 


Rysowanie figury:
Typ figury: Rectangle
Kolor figury: Red: 0, Green: 255, Blue: 0, Alpha: 0,70

Reprezentacja graficzna:
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 


Rysowanie figury:
Typ figury: Triangle
Kolor figury: Red: 0, Green: 0, Blue: 255, Alpha: 0,90

Reprezentacja graficzna:
   * *
  * * * * 
 * * * * * 
* * * * * * * 


Rysowanie figury:
Typ figury: Rectangle
Kolor figury: Red: 255, Green: 255, Blue: 0, Alpha: 0,50

Reprezentacja graficzna:
* * * * * * * 
* * * * * * * 
* * * * * * * 
* * * * * * * 
* * * * * * * 
* * * * * * * 
* * * * * * * 
* * * * * * * 


Rysowanie figury:
Typ figury: Triangle
Kolor figury: Red: 128, Green: 128, Blue: 128, Alpha: 1,00

Reprezentacja graficzna:
    * *
   * * * * 
  * * * * * * 
 * * * * * * * * 
* * * * * * * * * * 




<!DOCTYPE html>
<html lang="pl">
<body>
    <style>
        .bar {
            display: flex;
            align-items: center;
        }
        .green {
            background: #28a745;
            height: 10px;
            margin-right: 5px;
        }
        .red {
            background: #dc3545;
            height: 10px;
            margin-right: 5px;
        }
        .ctr2, .ctr1 {
            text-align: center;
        }
    </style>
    <h1>Raport Pokrycia Testami - lab3</h1>
    <table>
        <thead>
            <tr>
                <th>Element</th>
                <th>Missed Instructions</th>
                <th class="ctr2">Cov. Instructions</th>
                <th>Missed Branches</th>
                <th class="ctr2">Cov. Branches</th>
                <th class="ctr1">Missed Cxty</th>
                <th class="ctr2">Cxty</th>
                <th class="ctr1">Missed Lines</th>
                <th class="ctr2">Lines</th>
                <th class="ctr1">Missed Methods</th>
                <th class="ctr2">Methods</th>
                <th class="ctr1">Missed Classes</th>
                <th class="ctr2">Classes</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <td>Total</td>
                <td class="bar"><div class="green" style="width: 119px;"></div>3 of 544</td>
                <td class="ctr2">99%</td>
                <td class="bar"><div class="green" style="width: 120px;"></div>0 of 26</td>
                <td class="ctr2">100%</td>
                <td class="ctr1">1</td>
                <td class="ctr2">36</td>
                <td class="ctr1">1</td>
                <td class="ctr2">104</td>
                <td class="ctr1">1</td>
                <td class="ctr2">23</td>
                <td class="ctr1">0</td>
                <td class="ctr2">7</td>
            </tr>
        </tfoot>
        <tbody>
            <tr>
                <td><a href="default/index.html">default</a></td>
                <td class="bar"><div class="green" style="width: 119px;"></div>3 of 544</td>
                <td class="ctr2">99%</td>
                <td class="bar"><div class="green" style="width: 120px;"></div>0 of 26</td>
                <td class="ctr2">100%</td>
                <td class="ctr1">1</td>
                <td class="ctr2">36</td>
                <td class="ctr1">1</td>
                <td class="ctr2">104</td>
                <td class="ctr1">1</td>
                <td class="ctr2">23</td>
                <td class="ctr1">0</td>
                <td class="ctr2">7</td>
            </tr>
        </tbody>
    </table>
    <div class="footer">
        Stworzono za pomocą <a href="http://www.jacoco.org/jacoco">JaCoCo</a> 0.8.11.202310140853
    </div>
</body>
</html>
