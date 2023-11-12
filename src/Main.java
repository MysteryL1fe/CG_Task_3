import model.Model;
import model.TriangulatedModel;
import objUtils.ObjReader;
import objUtils.ObjWriter;
import triangulation.Triangulation;
import triangulation.TriangulationByPolygons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Model model = ObjReader.read(
                Files
                        .readAllLines(Path.of("src/input/13462_Samoyed_v1_L3.obj"))
                        .stream()
                        .reduce(
                                (a, b) -> a + "\n" + b
                        )
                        .get()
        );

        TriangulatedModel result = Triangulation.triangulate(model, new TriangulationByPolygons());

        ObjWriter.write(result, Path.of("out/result.obj"));
    }
}