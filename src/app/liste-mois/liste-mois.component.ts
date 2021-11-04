import { Component, OnInit } from '@angular/core';

export interface PeriodicElement {
  nom: string;
  prenom: string;
  email:string;}

  const ELEMENT_DATA: PeriodicElement[] = [
    {nom: 'Diarra', prenom: 'Awa', email:'awa@gmail.com'},
    
  ];

@Component({
  selector: 'app-liste-mois',
  templateUrl: './liste-mois.component.html',
  styleUrls: ['./liste-mois.component.css']
})
export class ListeMoisComponent implements OnInit {
  displayedColumns: string[] = ['nom', 'prenom', 'email'];
    dataSource = ELEMENT_DATA;

  constructor() { }

  ngOnInit(): void {
  }

}
