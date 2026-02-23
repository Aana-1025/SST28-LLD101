public abstract class Exporter {

    // Template method (final = contract enforced)
    public final ExportResult export(ExportRequest req) {

        if (req == null) {
            throw new IllegalArgumentException("ExportRequest cannot be null");
        }

        if (req.title == null) req = new ExportRequest("", req.body);
        if (req.body == null) req = new ExportRequest(req.title, "");

        return doExport(req);
    }

    // subclasses implement only this
    protected abstract ExportResult doExport(ExportRequest req);
}