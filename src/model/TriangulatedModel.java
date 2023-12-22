package model;

import exception.TooLowVertexIndicesException;
import triangulation.TriangulationAlgorithm;
import triangulation.SimpleTriangulation;

public class TriangulatedModel extends Model {
    private Model originalModel;

    public Model getOriginalModel() {
        return originalModel;
    }

    public void setOriginalModel(Model originalModel) {
        this.originalModel = originalModel;
    }

    public static TriangulatedModel fromModel(Model model) throws TooLowVertexIndicesException {
        return fromModel(model, new SimpleTriangulation());
    }

    public static TriangulatedModel fromModel(Model model, TriangulationAlgorithm algorithm) throws TooLowVertexIndicesException {
        TriangulatedModel result = new TriangulatedModel();
        result.setOriginalModel(model);
        result.vertices.addAll(model.vertices);
        result.textureVertices.addAll(model.textureVertices);
        result.normals.addAll(model.normals);
        result.polygons.addAll(algorithm.toTriangles(model.polygons));

        return result;
    }
}
