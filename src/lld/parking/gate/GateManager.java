package lld.parking.gate;

import java.util.List;

public class GateManager {

  List<EntryGate> entries;

  List<ExitGate> exits;

  public void addEntryGate(EntryGate gate) {
    entries.add(gate);
  }

  public void removeEntryGate(EntryGate gate) {
    entries.remove(gate);
  }

  public void addExitGate(ExitGate exitGate) {
    exits.add(exitGate);
  }

  public void removeExitGate(ExitGate exitGate) {
    exits.remove(exitGate);
  }


}
