package com.example;

public class Health {

    private String status;

    private DiskSpace diskSpace;

    public Health() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiskSpace getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(DiskSpace diskSpace) {
        this.diskSpace = diskSpace;
    }

    @Override
    public String toString() {
        return "Health{" +
                "status='" + status + '\'' +
                ", diskSpace=" + diskSpace +
                '}';
    }
}
