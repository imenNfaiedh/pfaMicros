package com.example.workflow;

public class StartProcessRequest{
private String demandeId;
private String userTosend;
private String dateSaisie;

// Getters and Setters
public String getDemandeId() {
    return demandeId;
}

public void setDemandeId(String demandeId) {
    this.demandeId = demandeId;
}

public String getUserTosend() {
    return userTosend;
}

public void setUserTosend(String userTosend) {
    this.userTosend = userTosend;
}

public String getDateSaisie() {
    return dateSaisie;
}

public void setDateSaisie(String dateSaisie) {
    this.dateSaisie = dateSaisie;
}
}