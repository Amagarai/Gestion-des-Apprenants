import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatToolbarModule } from '@angular/material/toolbar';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatDividerModule} from '@angular/material/divider';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import { ListePresenceComponent } from './liste-presence/liste-presence.component';
import { ValidationComponent } from './validation/validation.component';
import { CrudComponent } from './crud/crud.component';
import {MatTableModule} from '@angular/material/table';
import { AjoutComponent } from './ajout/ajout.component';
import { ListerComponent } from './lister/lister.component';
import { ModifierComponent } from './modifier/modifier.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import { AjoutFormateurComponent } from './ajout-formateur/ajout-formateur.component';
import { ListeJourComponent } from './liste-jour/liste-jour.component';
import { ListeSemaineComponent } from './liste-semaine/liste-semaine.component';
import { ListeMoisComponent } from './liste-mois/liste-mois.component';
import { ListeApprenantComponent } from './liste-apprenant/liste-apprenant.component';


@NgModule({
  declarations: [
    AppComponent,
    ListePresenceComponent,
    ValidationComponent,
    CrudComponent,
    AjoutComponent,
    ListerComponent,
    ModifierComponent,
    AjoutFormateurComponent,
    ListeJourComponent,
    ListeSemaineComponent,
    ListeMoisComponent,
    ListeApprenantComponent,
    
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    MatButtonModule,
    MatDividerModule,
    MatIconModule,
    MatSidenavModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatFormFieldModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
