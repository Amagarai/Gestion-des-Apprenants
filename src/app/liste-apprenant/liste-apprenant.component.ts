import { Component, OnInit } from '@angular/core';

export interface PeriodicElement {
  nom: string;
  prenom: string;
  email:string;}

  const ELEMENT_DATA: PeriodicElement[] = [
    {nom: 'Diarra', prenom: 'Awa', email:'awa@gmail.com'},
    
  ];

@Component({
  selector: 'app-liste-apprenant',
  templateUrl: './liste-apprenant.component.html',
  styleUrls: ['./liste-apprenant.component.css']
})
export class ListeApprenantComponent implements OnInit {

  displayedColumns: string[] = ['nom', 'prenom', 'email', 'suppression','modification'];
  dataSource = ELEMENT_DATA;

  constructor() { }

  ngOnInit(): void {
  }

}
