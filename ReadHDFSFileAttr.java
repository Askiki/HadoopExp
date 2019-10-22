package hadoop.ch03.ly17034460229;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

public class ReadHDFSFileAttr {
    public static void main( String[] args )throws Exception{
        Configuration conf =new Configuration() ;
        URI uri =new URI ("hdfs://192.168.30.131:8020");
        FileSystem fs =FileSystem.get(uri,conf,"hadoop");
        Path path =new Path("/17034460229/test5.txt");
        User liuyan =new User();
        String useid = liuyan.getId();
        System.out.println("取得id"+liuyan.getId());
        FSDataOutputStream os =fs.create(path,true);
        os.writeBytes(useid);
        fs.close();
    }
}
