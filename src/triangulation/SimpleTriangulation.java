package triangulation;

import model.Model;
import model.Polygon;

import java.util.ArrayList;

public class SimpleTriangulation implements TriangulationAlgorithm {
    @Override
    public ArrayList<Polygon> toTriangles(Model model) {
        ArrayList<Polygon> polygons = new ArrayList<>();

        for (int i = 2; i < model.vertices.size(); i++) {
            ArrayList<Integer> vertexIndices = new ArrayList<>();
            vertexIndices.add(0);
            vertexIndices.add(i - 1);
            vertexIndices.add(i);

            Polygon polygon = new Polygon();
            polygon.setVertexIndices(vertexIndices);

            polygons.add(polygon);
        }

        return polygons;
    }
}
