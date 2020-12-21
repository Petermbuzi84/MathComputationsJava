package mbuzi.petermbuzi.math.computations.polygons;

public class Polygons {

    public double sumInteriorAnglesNumberSides(double number_of_sides) {
        return 180 * (number_of_sides - 2);
    }

    public double sumExteriorAngle() {
        return 360;
    }

    public double sizeInteriorAngleNumberSides(double number_of_sides) {
        double num = 180 * (number_of_sides - 2);
        return num / number_of_sides;
    }

    public double sizeExteriorAngleNumberSides(double number_of_sides) {
        return sumExteriorAngle() / number_of_sides;
    }

    public double sizeExteriorAngleSumInterior(double sumInteriorAngles) {
        return 64800 / (sumInteriorAngles + 360);
    }

    public double numberSidesSumInteriorAngles(double sumInteriorAngles) {
        return (sumInteriorAngles + 360) / 180;
    }

    public double numberSidesSizeInteriorAngle(double sizeInteriorAngle) {
        return 360 / (180 - sizeInteriorAngle);
    }

    public double numberSidesSizeExteriorAngle(double sizeExteriorAngle) {
        return 360 / sizeExteriorAngle;
    }

    public double numberSidesConstantSizeInteriorExterior(double constant) {
        return 2 * (constant + 1);
    }

    public double numberSidesConstantSumInteriorSizeExterior(double constant) {
        double a = 1 + 2 * constant;
        double sq = Math.sqrt(a);
        return 1 + sq;
    }

    public String nameOfPolygon(int number_of_sides) {
        switch (number_of_sides) {
            case 3:
                return "Triangle";
            case 4:
                return "Quadrilateral";
            case 5:
                return "Pentagon";
            case 6:
                return "Hexagon";
            case 7:
                return "Heptagon";
            case 8:
                return "Octagon";
            case 9:
                return "Nonagon";
            case 10:
                return "Decagon";
            case 11:
                return "Hendecagon";
            case 12:
                return "Dodecagon";
            case 13:
                return "Triskaidecagon";
            case 14:
                return "Tetrakaidecagon";
            case 15:
                return "Pentadecagon";
            case 16:
                return "Hexakaidecagon";
            case 17:
                return "Heptadecagon";
            case 18:
                return "Octakaidecagon";
            case 19:
                return "Enneadecagon";
            case 20:
                return "Icosagon";
            case 30:
                return "Triacontagon";
            case 40:
                return "Tetracontagon";
            case 50:
                return "Pentacontagon";
            case 60:
                return "Hexacontagon";
            case 70:
                return "Heptacontagon";
            case 80:
                return "Octacontagon";
            case 90:
                return "Enneacontagon";
            case 100:
                return "Hectagon";
            case 1000:
                return "Chiliagon";
            case 10000:
                return "Myriagon";
            case 1000000:
                return "Megagon";
        }
        return "Invalid Polygon";
    }
}
