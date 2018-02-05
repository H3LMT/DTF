package com.example.tinachou.hacked;
import java.util.*;
/**
 * Created by tinachou on 10/28/17.
 */

public class places
{
    public static ArrayList<Location> showPlaces = new ArrayList<Location>();

    private static Location abp = new Location("Au Bon Pain", false, false, true, false, true, 40.443405, -79.942011);

    private static Location hunt = new Location("Hunt Library", true, false, true, true, true, 40.441805, -79.943722);

    private static Location sb = new Location("Starbucks", false, false, true, false, true, 40.444570, -79.948563);

    private static Location mw = new Location("Morewood Maker Space", true, false, true, true, false, 40.445444, -79.943243);

    private static Location park = new Location("Schenley Park", false,true, false, false, false, 40.4348533, -79.9446773);

    private static Location gates = new Location("Gates Center for Computer Science", true, false, true, true, true, 40.444276, -79.943934);

    private static Location sorrels = new Location("Sorrels Library", true, false, true, true, false, 40.442647, -79.945784);

    private static Location garden = new Location("Botanical Gardens", false, true, false, false, false, 40.438209, -79.948518);

    private static Location num = new Location("Number Garden", true, true, true, false, false, 40.441520, -79.942442);

    private static Location donner = new Location("Donner Study Room", true, false, true, false, false, 40.441756, -79.941556);

    private static Location[] check = new Location[]{abp, hunt, sb, mw, park, gates, sorrels, garden, num, donner};

    public static Location[] getCheck()
    {
        return check;
    }

}
