package MercuryTours.report;

import core.utils.Log;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Report Mercury Tours class.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class Report {
    /**
     * This method gets an instance of Report from getInstance.
     *
     * @return an instance Report.
     */
    public static Report getInstance() {
        return new Report();
    }

    /**
     * This method set up and create a report.
     */
    public void generateReport() {
        final File reportOutputDirectory = new File("target");
        final List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");
        final String projectName = "NEW_TOURS";
        final boolean runWithJenkins = false;
        final Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.addClassifications("Platform", "WINDOWS");
        configuration.addClassifications("Branch", "RELEASE/1.0");
        final ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        final Reportable result = reportBuilder.generateReports();
        Log.getInstance().getLogger().info(result);
    }
}
