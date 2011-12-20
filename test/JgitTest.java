import junit.framework.Assert;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yvonnickesnault
 * Date: 20/12/11
 * Time: 21:42
 * To change this template use File | Settings | File Templates.
 */
public class JgitTest {


    @Test
    public void testFileRepositoryBuilder() {
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        try {
            Repository repository = builder.setGitDir(new File("/tmp/test"))
                    .readEnvironment() // scan environment GIT_* variables
                    .findGitDir() // scan up the file system tree
                    .build();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            Assert.fail();
        }

    }
}
