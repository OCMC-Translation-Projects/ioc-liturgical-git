package org.ocmc.git;

import org.junit.Test;
import org.ocmc.ioc.liturgical.schemas.models.synch.GithubRepo;
import org.ocmc.ioc.liturgical.schemas.models.synch.GithubRepositories;

import junit.framework.TestCase;

public class JGitUtilsTest extends TestCase {

	@Test
	public void test() {
		String alwbPath = "/Users/mac002/Git/alwb-repositories/ages"; // ages only
		assertTrue(JGitUtils.resetAllGitRepos(alwbPath));
	}

}
