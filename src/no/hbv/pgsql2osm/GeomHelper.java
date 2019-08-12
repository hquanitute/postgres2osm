package no.hbv.pgsql2osm;

/**
 * Created by Knut Johan Hesten on 2016-02-25.
 * Last updated by Knut Johan Hesten on 2016-06-08
 */
class GeomHelper {
    static private Double minX = Double.MAX_VALUE, minY = Double.MAX_VALUE, maxX = 0.0, maxY = 0.0;
    static private long idNode = 0;
    static private long idWay = 128000000;
    static void setMinX(Double minX) {
        if (GeomHelper.minX > minX) {
            GeomHelper.minX = minX;
        }
    }
    static void setMinY(Double minY) {
        if (GeomHelper.minY > minY) {
            GeomHelper.minY = minY;
        }
    }
    static void setMaxX(Double maxX) {
        if (GeomHelper.maxX < maxX) {
            GeomHelper.maxX = maxX;
        }
    }
    static void setMaxY(Double maxY) {
        if (GeomHelper.maxY < maxY) {
            GeomHelper.maxY = maxY;
        }
    }

    static String getMinX() { return Const.getDf().format(minX); }
    static String getMinY() { return Const.getDf().format(minY); }
    static String getMaxX() { return Const.getDf().format(maxX); }
    static String getMaxY() { return Const.getDf().format(maxY); }

    static long getAndIncrementNodeId() {
        return idNode++;
    }

    static long getAndIncrementWayId() {
        return idWay++;
    }
}
