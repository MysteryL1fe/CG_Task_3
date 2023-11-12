package triangulation;

import model.Model;
import model.Polygon;

import java.util.ArrayList;

public interface TriangulationAlgorithm {
    ArrayList<Polygon> toTriangles(Model model);
}
