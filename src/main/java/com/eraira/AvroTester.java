package com.eraira;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by rahul on 24/03/18.
 */
public class AvroTester {
    private static File outputFile;
    public static void main(String[] args) throws IOException, URISyntaxException {
        outputFile = new File(AvroTester.class.getClass().
                getResource("/output/").toURI().getPath() + "data.avro");
        //write();
        read();

    }

    static void write()throws IOException, URISyntaxException{
        User user1 = new User("usr1", null, null);
        User user2 = new User("usr2", 1, null);

        DatumWriter<User> datumWriter = new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(datumWriter);
        dataFileWriter.create(user1.getSchema(), outputFile );
        dataFileWriter.append(user1);
        dataFileWriter.append(user2);
        dataFileWriter.close();
    }

    static void read() throws IOException {
        User user = null;
        DatumReader<User> datumReader = new SpecificDatumReader<User>(User.class);
        DataFileReader<User> dataFileReader = new DataFileReader<User>(outputFile, datumReader);
        while(dataFileReader.hasNext()){
            user = dataFileReader.next();
            System.out.println(user.toString());
        }

    }

}
