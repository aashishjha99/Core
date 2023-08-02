package lld.elevtor;

import java.util.TreeSet;

public class Elevator {

    private Direction currDirection = Direction.UP;

    private Integer currfloor = 0;

    private State currentState = State.IDLE;

    private TreeSet<Request> currentPendingJobs = new TreeSet<>();
    private TreeSet<Request> upPendingJobs = new TreeSet<>();
    private TreeSet<Request> downPendingJobs = new TreeSet<>();


    public void startElevator() {

        System.out.println("Elevator has started functioning");

        while (true) {

            if (checkIfJob()) {

                if (currDirection == Direction.UP) {
                    Request request = currentPendingJobs.pollFirst();
                    prrocessRequest(request);

                    if (currentPendingJobs.isEmpty()) {
                        addPendingJobsToCurrentJobs();
                    }
                }
            }
        }
    }

    private void prrocessRequest(Request request) {

        int startFloor = currfloor;

        if (startFloor < request.getExternalRequest().getSrcFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSrcFloor(); i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("We have reached floor ---" + i);
                currfloor = i;

            }
        }

        System.out.println("Reached Source floor -- opening door");

        startFloor = currfloor;

        for (int i = startFloor + 1; i <= request.getInternalRequest().getFloor(); i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("We have reached floor --" + i);
            currfloor = i;

            if (checkIfNewJobCanBeProccesed()){
                break;
            }
        }
    }

    private boolean checkIfNewJobCanBeProccesed() {
    }


    private boolean checkIfJob() {
        return currentPendingJobs.isEmpty() ? false : true;
    }


}
