import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AjoutFormateurComponent } from './ajout-formateur/ajout-formateur.component';
import { AjoutComponent } from './ajout/ajout.component';
import { CrudComponent } from './crud/crud.component';
import { ListeApprenantComponent } from './liste-apprenant/liste-apprenant.component';
import { ListeJourComponent } from './liste-jour/liste-jour.component';
import { ListeMoisComponent } from './liste-mois/liste-mois.component';
import { ListePresenceComponent } from './liste-presence/liste-presence.component';
import { ListeSemaineComponent } from './liste-semaine/liste-semaine.component';
import { ListerComponent } from './lister/lister.component';
import { ModifierComponent } from './modifier/modifier.component';
import { ValidationComponent } from './validation/validation.component';

const routes: Routes = [
  {path:"", component:ListePresenceComponent},
  {path:"validation", component:ValidationComponent},
  {path:"crud", component:CrudComponent},
  {path:"ajouterApprenant", component:AjoutComponent},
  {path:"lister", component:ListerComponent},
  {path:"modifier", component:ModifierComponent},
  {path:"ajouterFormateur", component:AjoutFormateurComponent},
  {path:"listeJour",component:ListeJourComponent },
  {path:"listeSemaine",component:ListeSemaineComponent },
  {path:"listeMois",component:ListeMoisComponent },
  {path:"listeApprenant",component:ListeApprenantComponent }









];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
