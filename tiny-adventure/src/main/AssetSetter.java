package main;

import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Potion;

public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;

    }
    public void setObject(){
        // place coordinates of object
        gp.obj[0] = new OBJ_Key(gp);
        gp.obj[0].worldX = 22 *gp.tileSize;
        gp.obj[0].worldY = 21 * gp.tileSize;
        gp.obj[1] = new OBJ_Key(gp);
        gp.obj[1].worldX = 19 *gp.tileSize;
        gp.obj[1].worldY =  20 * gp.tileSize;
        gp.obj[2] = new OBJ_Door(gp);
        gp.obj[2].worldX = 23 *gp.tileSize;
        gp.obj[2].worldY = 25 * gp.tileSize;

        gp.obj[3] = new OBJ_Chest(gp);
        gp.obj[3].worldX = 19 *gp.tileSize;
        gp.obj[3].worldY = 21 * gp.tileSize;

        gp.obj[4] = new OBJ_Door(gp);
        gp.obj[4].worldX = 27 *gp.tileSize;
        gp.obj[4].worldY = 21 * gp.tileSize;


        gp.obj[5] = new OBJ_Potion(gp);
        gp.obj[5].worldX = 20 *gp.tileSize;
        gp.obj[5].worldY = 26 * gp.tileSize;

    }
}
