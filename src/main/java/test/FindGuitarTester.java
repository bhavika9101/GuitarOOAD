package test;

import model.*;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes =
                new GuitarSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                InstrumentSpec spec = guitar.getSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n     " +
                        spec.getBackWood() + " back and sides,\n     " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
        System.out.println("\n");
        MandolinSpec whatMariaLikes =
                new MandolinSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, Style.A, Wood.ALDER, Wood.ALDER);
        List matchingMandolins = inventory.search(whatMariaLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Maria, you might like these mandolins:");
            for (Iterator i = matchingMandolins.iterator(); i.hasNext(); ) {
                Mandolin mandolin = (Mandolin) i.next();
                InstrumentSpec spec = mandolin.getSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " mandolin:\n     " +
                        spec.getBackWood() + " back and sides,\n     " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        mandolin.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Maria, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("11277", 3999.95,
                new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
                        Wood.INDIAN_ROSEWOOD, Wood.SITKA));
        inventory.addInstrument("V95693", 1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                        Wood.ALDER, Wood.ALDER));
        inventory.addInstrument("V9512", 1549.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                        Wood.ALDER, Wood.ALDER));
        inventory.addInstrument("122784", 5495.95,
                new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6,
                        Wood.MAHOGANY, Wood.ADIRONDACK));
        inventory.addInstrument("76531", 6295.95,
                new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
        inventory.addInstrument("70108276", 2295.95,
                new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
                        Wood.MAHOGANY, Wood.MAHOGANY));
        inventory.addInstrument("82765501", 1890.95,
                new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6,
                        Wood.MAHOGANY, Wood.MAHOGANY));
        inventory.addInstrument("77023", 6275.95,
                new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
        inventory.addInstrument("1092", 12995.95,
                new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12,
                        Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
        inventory.addInstrument("566-62", 8999.95,
                new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12,
                        Wood.COCOBOLO, Wood.CEDAR));
        inventory.addInstrument("6 29584", 2100.95,
                new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC,
                        6, Wood.MAHOGANY, Wood.MAPLE));

        inventory.addInstrument("M1001", 1499.95,
                new MandolinSpec(Builder.GIBSON, "F-5G", Type.ACOUSTIC,
                        Style.F, Wood.MAPLE, Wood.MAPLE));

        inventory.addInstrument("M1002", 899.95,
                new MandolinSpec(Builder.FENDER, "FM-52E", Type.ELECTRIC,
                        Style.A, Wood.MAHOGANY, Wood.BRAZILIAN_ROSEWOOD));

        inventory.addInstrument("M1003", 1299.95,
                new MandolinSpec(Builder.MARTIN, "A-Style 1", Type.ACOUSTIC,
                        Style.A, Wood.MAHOGANY, Wood.SITKA));

        inventory.addInstrument("M1004", 1799.95,
                new MandolinSpec(Builder.COLLINGS, "MT2", Type.ACOUSTIC,
                        Style.F, Wood.MAPLE, Wood.ADIRONDACK));

        inventory.addInstrument("M1005", 999.95,
                new MandolinSpec(Builder.GIBSON, "A-9", Type.ACOUSTIC,
                        Style.A, Wood.MAPLE, Wood.INDIAN_ROSEWOOD));

        inventory.addInstrument("M1006", 1599.95,
                new MandolinSpec(Builder.PRS, "SE Mandolin", Type.ELECTRIC,
                        Style.A, Wood.MAHOGANY, Wood.MAPLE));

        inventory.addInstrument("M1007", 2199.95,
                new MandolinSpec(Builder.RYAN, "F-Style Custom", Type.ACOUSTIC,
                        Style.F, Wood.COCOBOLO, Wood.CEDAR));

        inventory.addInstrument("M1008", 1399.95,
                new MandolinSpec(Builder.OLSON, "SJ Mandolin", Type.ACOUSTIC,
                        Style.A, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));

        inventory.addInstrument("M1009", 1899.95,
                new MandolinSpec(Builder.GIBSON, "F-9", Type.ACOUSTIC,
                        Style.F, Wood.MAPLE, Wood.MAPLE));

        inventory.addInstrument("M1010", 1099.95,
                new MandolinSpec(Builder.FENDER, "FM-100", Type.ACOUSTIC,
                        Style.A, Wood.ALDER, Wood.SITKA));
        inventory.addInstrument("M3001", 1100.95,
                new MandolinSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, Style.A,
                        Wood.ALDER, Wood.ALDER));

        inventory.addInstrument("M3002", 1200.95,
                new MandolinSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, Style.F,   // different style ✔ still matches
                        Wood.ALDER, Wood.ALDER));

        inventory.addInstrument("M3003", 1300.95,
                new MandolinSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, Style.A,
                        Wood.ALDER, Wood.ALDER));

        inventory.addInstrument("M3004", 1400.95,
                new MandolinSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, Style.F,
                        Wood.ALDER, Wood.ALDER));
    }
}