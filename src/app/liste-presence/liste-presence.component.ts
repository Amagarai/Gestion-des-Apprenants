import { Time } from '@angular/common';
import { Component, OnInit } from '@angular/core';


export interface PeriodicElement {
  nom: string;
  prenom: string;
  email:string;
  arrivee: string;
  depart: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {nom: 'Diarra', prenom: 'Awa', email:'awa@gmail.com', arrivee:'heureArrivée' , depart:'heureDepart'},
  
];



@Component({
  selector: 'app-liste-presence',
  templateUrl: './liste-presence.component.html',
  styleUrls: ['./liste-presence.component.css']
})
export class ListePresenceComponent implements OnInit {
  displayedColumns: string[] = ['nom', 'prenom', 'email', 'arrivee','depart'];
  dataSource = ELEMENT_DATA;
  constructor() { }

  ngOnInit(): void {
  }

}
