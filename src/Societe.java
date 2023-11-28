package tp9;

public abstract class Societe {
  protected double coutUnitVehicule = 5.0 ;
  protected int nbrVehicules;

  public void ajouteVehicule()
  {
    nbrVehicules = nbrVehicules + 1;
  }

  public abstract double calculeCoutEntretien();

  public abstract boolean ajouteFiliale(Societe filiale);
}
