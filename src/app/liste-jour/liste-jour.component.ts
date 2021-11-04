import { Component, OnInit } from '@angular/core';

export interface PeriodicElement {
  nom: string;
  prenom: string;
  email:string;}

  const ELEMENT_DATA: PeriodicElement[] = [
    {nom: 'Diarra', prenom: 'Awa', email:'awa@gmail.com'},
    
  ];

@Component({
  selector: 'app-liste-jour',
  templateUrl: './liste-jour.component.html',
  styleUrls: ['./liste-jour.component.css']
})
export class ListeJourComponent implements OnInit {

  displayedColumns: string[] = ['nom', 'prenom', 'email'];
    dataSource = ELEMENT_DATA;

  constructor() { }

  ngOnInit(): void {
  }

}
