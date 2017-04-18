import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * Created by Nicolas on 18/04/2017.
 * Add the .jar with dependancies in your HDFS then execute these commands in Impala :
 * DROP FUNCTION IF EXISTS hashUDF(STRING);
 * CREATE FUNCTION IF NOT EXISTS hashUDF(String) RETURNS INT LOCATION 'hdfs:///user/hdfs/UDF/hive-udf-samples-1.0-jar-with-dependencies.jar' SYMBOL='Ascii';
 */
public class Ascii  extends UDF {
    public Ascii(){

    }
    public int evaluate(String str /** Parameter(s) of the function **/ ) {
        /** Your code here **/
        return str.hashCode();
    }

}
