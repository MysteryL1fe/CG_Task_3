package triangulation;

import exception.TooLowVertexIndicesException;
import model.Polygon;

import java.util.ArrayList;
import java.util.List;

public interface TriangulationAlgorithm {
    ArrayList<Polygon> toTriangles(List<Polygon> polygonList) throws TooLowVertexIndicesException;
}
