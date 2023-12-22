package objUtils;

import math.Vector2f;
import math.Vector3f;
import model.Model;
import model.Polygon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ObjWriter {
    public static void write(Model model, Path path) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (Vector3f vertex : model.vertices)
            sb.append(String.format("v %s %s %s%n", vertex.getX(), vertex.getY(), vertex.getZ()));

        for (Vector2f textureVertex : model.textureVertices)
            sb.append(String.format("vt %s %s%n", textureVertex.getX(), textureVertex.getY()));

        for (Vector3f normals : model.normals)
            sb.append(String.format("vn %s %s %s%n", normals.getX(), normals.getY(), normals.getZ()));

        for (Polygon polygon : model.polygons)
            sb.append(String.format(
                    "f %s %s %s%n", polygon.getVertexIndices().get(0) + 1,
                    polygon.getVertexIndices().get(1) + 1, polygon.getVertexIndices().get(2) + 1));

        Files.writeString(path, sb.toString());
    }
}
