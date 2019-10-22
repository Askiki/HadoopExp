package hadoop.ch03.ly17034460229;
import java.text.SimpleDateFormat;
import java.net.URI;
import java.util.Date;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileStatus;
public class ReadHDFSFile {
    public static void main( String[] args )throws Exception{
        Configuration conf =new Configuration() ;
        URI uri =new URI ("hdfs://192.168.30.131:8020");

        FileSystem fs =FileSystem.get(uri,conf,"hadoop");

        Path path =new Path("/17034460229/test5.txt");

        FileStatus fileStatus=fs.getFileStatus(path);

        long blockSize = fs.getBlockSize(path);
        System.out.println("blockSize:"+blockSize);

        long fileSize = fileStatus.getLen();
        System.out.println("fileSize:"+fileSize);

        String fileOwner = fileStatus.getOwner();
        System.out.println("fileOwner:"+fileOwner);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        long accessTime = fileStatus.getAccessTime();
        System.out.println("accessTime:"+sdf.format(new Date(accessTime)));

        long modifyTime = fileStatus.getModificationTime();
        System.out.println("modifyTime:"+sdf.format(new Date(modifyTime)));

        User liuyan =new User();
        String useid = liuyan.getId();
        System.out.println("id"+useid);

        fs.close();
    }
}
