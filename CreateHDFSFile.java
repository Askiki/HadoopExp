package hadoop.ch03.ly17034460229;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.*;
import java.net.URI;
import java.net.URI.*;

public class CreateHDFSFile {
    public static void main( String[] args )throws Exception{
             Configuration conf =new Configuration() ;
        URI uri =new URI ("hdfs://192.168.30.131:8020");

        FileSystem fs =FileSystem.get(uri,conf,"hadoop");

        Path dfs =new Path("/17034460229/test5.txt");

        FSDataOutputStream os =fs.create(dfs,true);

        os.writeBytes("hello world!29\n");

        os.close();
        fs.close();
    }
}

