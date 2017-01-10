package com.example;

public class DiskSpace {

    private String status;

    private Long total;

    private Long free;

    private Long threshold;

    public DiskSpace() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getFree() {
        return free;
    }

    public void setFree(Long free) {
        this.free = free;
    }

    public Long getThreshold() {
        return threshold;
    }

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "DiskSpace{" +
                "status='" + status + '\'' +
                ", total=" + total +
                ", free=" + free +
                ", threshold=" + threshold +
                '}';
    }
}
