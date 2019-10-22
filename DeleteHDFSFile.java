package hadoop.ch03.ly17034460229;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.net.URI;

public class DeleteHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();

        URI uri = new URI("hdfs://192.168.30.131:8020");

        FileSystem fs = FileSystem.get(uri, conf, "hadoop");

        Path dfs = new Path("/17034460229/test2.txt");

        fs.delete(dfs);
        fs.close();
        System.out.println("delete sucessfully!");

    }
}
