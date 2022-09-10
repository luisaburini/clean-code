package ch02;

import java.util.ArrayList;
import java.util.List;
import ch02.Cell;

public class InformativeNameExample {

    public List<Cell> gameBoard;

    // Codigo dificil de ler!!
    // public List<int[]> getThem()
    // {
    //     List<int[]> list1 = new ArrayList<int[]>();
        
    //     for(int[] x : theList)
    //     {
    //         if(x[0] == 4)
    //         {
    //             list1.add(x);
    //         }
    //     }
    //     return list1;
    // }

    // Codigo mais facil de ler e entender o que faz!
    // public List<int[]> getFlaggedCells()
    // {
    //     List<int[]> flaggedCells = new ArrayList<int[]>();
    //     for(int[] cell : gameBoard)
    //     {
    //         if(cell[STATUS_VALUE] == FLAGGED)
    //         {
    //             flaggedCells.add(cell);
    //         }
    //     }

    //     return flaggedCells;
    // }

    // Codigo ainda mais facil de ler e entender o que faz!!
    // Utiliza uma classe para definir Cell 
    public List<Cell> getFlaggedCells()
    {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for(Cell cell : gameBoard)
        {
            if(cell.isFlagged())
            {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }

};

