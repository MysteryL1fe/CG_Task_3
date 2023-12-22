import exception.TooLowVertexIndicesException;
import model.Model;
import model.TriangulatedModel;
import objUtils.ObjReader;
import objUtils.ObjWriter;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Model model = ObjReader.read(Path.of("src/input/Deer.obj"));

        TriangulatedModel result = null;
        try {
            result = TriangulatedModel.fromModel(model);
        } catch (TooLowVertexIndicesException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result.equals(model));

        ObjWriter.write(result, Path.of("out/result2.obj"));
    }
}