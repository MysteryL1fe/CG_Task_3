package triangulation;

import model.Model;
import model.Polygon;
import model.TriangulatedModel;

import java.util.ArrayList;

public class Triangulation {
    public static TriangulatedModel triangulate(Model model) {
        return triangulate(model, new SimpleTriangulation());
    }

    public static TriangulatedModel triangulate(Model model, TriangulationAlgorithm algorithm) {
        TriangulatedModel result = new TriangulatedModel();
        result.setOriginalModel(model);
        result.vertices.addAll(model.vertices);
        result.textureVertices.addAll(model.textureVertices);
        result.normals.addAll(model.normals);
        result.polygons.addAll(algorithm.toTriangles(model));

        return result;
    }
}
