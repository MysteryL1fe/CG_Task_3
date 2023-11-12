package triangulation;

import model.Model;
import model.Polygon;

import java.util.ArrayList;

public class TriangulationByPolygons implements TriangulationAlgorithm {
    @Override
    public ArrayList<Polygon> toTriangles(Model model) {
        ArrayList<Polygon> polygons = new ArrayList<>();

        for (Polygon polygon : model.polygons) {
            ArrayList<Integer> vertexIndices = polygon.getVertexIndices();
            if (vertexIndices.size() > 3) {
                for (int i = 2; i < vertexIndices.size(); i++) {
                    ArrayList<Integer> newVertexIndices = new ArrayList<>();
                    newVertexIndices.add(vertexIndices.get(0));
                    newVertexIndices.add(vertexIndices.get(i - 1));
                    newVertexIndices.add(vertexIndices.get(i));

                    Polygon newPolygon = new Polygon();
                    newPolygon.setVertexIndices(newVertexIndices);

                    polygons.add(newPolygon);
                }
            } else polygons.add(polygon);
        }

        return polygons;
    }
}
