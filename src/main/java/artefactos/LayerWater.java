package artefactos;

import com.googlecode.lanterna.TextColor;
import static gui.Map.BRANCHESCOUNT;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.waterpos;
import static gui.Map.bkgColor;
import gui.SymbolsMirk;

/**
 *
 * @author Trainerpl022
 */
public class LayerWater extends MapLayer {
    
    public LayerWater() {
        super();
        
        generateWater();
    }
    
    	public void generateWater() {
            	int col = _rand.nextInt(COLUMNS);
		for (int i = 0; i < LINES; i++) {
			waterpos[i] = col + (_rand.nextInt(2) - 1);
		}
			for (int i = 0; i < waterpos.length; i++) {
					this.objectos[waterpos[i]][i] = new Water2(SymbolsMirk.WATER[2]);
                        }                 						
        }
               
	}

   
       
    