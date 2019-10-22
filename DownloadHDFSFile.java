package hadoop.ch03.ly17034460229;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

public class DownloadHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();

        URI uri = new URI("hdfs://192.168.30.131:8020");

        FileSystem fs = FileSystem.get(uri, conf, "hadoop");

        Path src = new Path("/17034460229/test5.txt");
        Path dest = new Path("D://17034460229/test5.txt");
        fs.copyToLocalFile(false,src,dest,true);
        fs.close();
        System.out.println("Download sucessfully!");

    }
}
