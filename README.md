# website-resources

This application is a tool which downloads websites and stores them in db.

Documentation of application API is defined in api-specification/website-api.yaml.
Copy content of the file and paste into Swagger Editor: https://editor.swagger.io.

Contract of API layer of application is automatically generated by Open API tools, so compile project before you run it.

Documentation of code is put directly as javadoc.

**Project Roadmap**
 - add unit tests
 - add integration tests
 - add queue to send website downloading status to client
 - ad profiles to differ production and developer db configuration
 - use Hazelcast as a cache