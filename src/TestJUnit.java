import exception.TooLowVertexIndicesException;
import model.Polygon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import triangulation.SimpleTriangulation;
import java.util.ArrayList;
import java.util.Arrays;

public class TestJUnit {
    private ArrayList<Polygon> originals1;
    private ArrayList<Polygon> originals2;
    private ArrayList<Polygon> originals3;
    private ArrayList<Polygon> triangles1;
    private ArrayList<Polygon> triangles2;
    private ArrayList<Polygon> triangles3;

    @Before
    public void setUp() {
        Polygon original1 = new Polygon();
        original1.setVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        original1.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        original1.setNormalIndices(new ArrayList<>(Arrays.asList(0, 5, 10)));

        Polygon original2 = new Polygon();
        original2.setVertexIndices(new ArrayList<>(Arrays.asList(3, 4, 5)));
        original2.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        original2.setNormalIndices(new ArrayList<>(Arrays.asList(1, 6, 11)));

        Polygon original3 = new Polygon();
        original3.setVertexIndices(new ArrayList<>(Arrays.asList(6, 7, 8)));
        original3.setTextureVertexIndices(new ArrayList<>(Arrays.asList(2, 1, 0)));
        original3.setNormalIndices(new ArrayList<>(Arrays.asList(2, 7, 12)));

        Polygon original4 = new Polygon();
        original4.setVertexIndices(new ArrayList<>(Arrays.asList(9, 10, 11)));
        original4.setTextureVertexIndices(new ArrayList<>(Arrays.asList(4, 5, 6)));
        original4.setNormalIndices(new ArrayList<>(Arrays.asList(3, 8, 13)));

        Polygon original5 = new Polygon();
        original5.setVertexIndices(new ArrayList<>(Arrays.asList(12, 13, 14)));
        original5.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 4, 8)));
        original5.setNormalIndices(new ArrayList<>(Arrays.asList(4, 9, 14)));

        originals1 = new ArrayList<>(Arrays.asList(original1, original2, original3, original4, original5));

        Polygon polygon1 = new Polygon();
        polygon1.setVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        polygon1.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        polygon1.setNormalIndices(new ArrayList<>(Arrays.asList(0, 5, 10)));

        Polygon polygon2 = new Polygon();
        polygon2.setVertexIndices(new ArrayList<>(Arrays.asList(3, 4, 5)));
        polygon2.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        polygon2.setNormalIndices(new ArrayList<>(Arrays.asList(1, 6, 11)));

        Polygon polygon3 = new Polygon();
        polygon3.setVertexIndices(new ArrayList<>(Arrays.asList(6, 7, 8)));
        polygon3.setTextureVertexIndices(new ArrayList<>(Arrays.asList(2, 1, 0)));
        polygon3.setNormalIndices(new ArrayList<>(Arrays.asList(2, 7, 12)));

        Polygon polygon4 = new Polygon();
        polygon4.setVertexIndices(new ArrayList<>(Arrays.asList(9, 10, 11)));
        polygon4.setTextureVertexIndices(new ArrayList<>(Arrays.asList(4, 5, 6)));
        polygon4.setNormalIndices(new ArrayList<>(Arrays.asList(3, 8, 13)));

        Polygon polygon5 = new Polygon();
        polygon5.setVertexIndices(new ArrayList<>(Arrays.asList(12, 13, 14)));
        polygon5.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 4, 8)));
        polygon5.setNormalIndices(new ArrayList<>(Arrays.asList(4, 9, 14)));

        triangles1 = new ArrayList<>(Arrays.asList(polygon1, polygon2, polygon3, polygon4, polygon5));

        /*originalModel2 = ObjReader.read(Path.of("src/input/test/test2.obj"));

        Polygon polygon6 = new Polygon();
        polygon6.setVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        polygon6.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon6.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon7 = new Polygon();
        polygon7.setVertexIndices(new ArrayList<>(Arrays.asList(0, 2, 3)));
        polygon7.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon7.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon8 = new Polygon();
        polygon8.setVertexIndices(new ArrayList<>(Arrays.asList(0, 3, 4)));
        polygon8.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon8.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon9 = new Polygon();
        polygon9.setVertexIndices(new ArrayList<>(Arrays.asList(9, 8, 7)));
        polygon9.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon9.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon10 = new Polygon();
        polygon10.setVertexIndices(new ArrayList<>(Arrays.asList(9, 7, 6)));
        polygon10.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon10.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon11 = new Polygon();
        polygon11.setVertexIndices(new ArrayList<>(Arrays.asList(9, 6, 5)));
        polygon11.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon11.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        triangles2 = new ArrayList<>(Arrays.asList(polygon6, polygon7, polygon8, polygon9, polygon10, polygon11));

        originalModel3 = ObjReader.read(Path.of("src/input/test/test3.obj"));
        Polygon polygon12 = new Polygon();
        polygon12.setVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        polygon12.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon12.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon13 = new Polygon();
        polygon13.setVertexIndices(new ArrayList<>(Arrays.asList(0, 2, 3)));
        polygon13.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon13.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon14 = new Polygon();
        polygon14.setVertexIndices(new ArrayList<>(Arrays.asList(0, 3, 4)));
        polygon14.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon14.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        Polygon polygon15 = new Polygon();
        polygon15.setVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 5)));
        polygon15.setTextureVertexIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));
        polygon15.setNormalIndices(new ArrayList<>(Arrays.asList(0, 0, 0)));

        triangles3 = new ArrayList<>(Arrays.asList(polygon12, polygon13, polygon14, polygon15));*/
    }

    @Test
    public void test1() throws TooLowVertexIndicesException {
        ArrayList<Polygon> triangulated = new SimpleTriangulation().toTriangles(originals1);
        Assert.assertEquals(triangulated, triangles1);
    }

    /*@Test
    public void test2() {
        TriangulatedModel triangulatedModel = TriangulatedModel.fromModel(originalModel2, new SimpleTriangulation());
        Assert.assertEquals(triangulatedModel.polygons, triangles2);
    }

    @Test
    public void test3() {
        TriangulatedModel triangulatedModel = TriangulatedModel.fromModel(originalModel3, new SimpleTriangulation());
        Assert.assertEquals(triangulatedModel.polygons, triangles3);
    }*/
}
