package patterns.behavioural.templatemethod;

import com.opencsv.CSVWriter;

public class HeaderCSVFile extends Data{

    @Override
    public void withHeader(CSVWriter csvWriter) {
        csvWriter.writeNext(new String[]{"NAME", "AGE", "ID"});
    }
}
