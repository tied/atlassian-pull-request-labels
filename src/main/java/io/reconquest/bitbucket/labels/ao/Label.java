package io.reconquest.bitbucket.labels.ao;

import net.java.ao.Entity;
import net.java.ao.Preload;
import net.java.ao.schema.Table;
import net.java.ao.schema.StringLength;
import net.java.ao.schema.NotNull;

@Preload
@Table("PullRequestLabels")
public interface Label extends Entity
{
    @NotNull
    String getName();
    @StringLength(StringLength.UNLIMITED)
    void setName(String name);

    @NotNull
    int getProjectId();
    void setProjectId(int projectid);

    @NotNull
    int getRepositoryId();
    void setRepositoryId(int repositoryid);

    @NotNull
    Long getPullRequestId();
    void setPullRequestId(Long pullrequestid);
}