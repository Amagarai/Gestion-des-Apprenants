import { Component, OnInit } from '@angular/core';

export interface PeriodicElement {
  nom: string;
  prenom: string;
  email:string;
  // arrivee: string;
  // depart: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {nom: 'Diarra', prenom: 'Awa', email:'awa@gmail.com'},
  
];

@Component({
  selector: 'app-validation',
  templateUrl: './validation.component.html',
  styleUrls: ['./validation.component.css']
})

export class ValidationComponent implements OnInit {

  
    displayedColumns: string[] = ['nom', 'prenom', 'email', 'arrivee','depart','validation'];
    dataSource = ELEMENT_DATA;
  constructor() { }

  ngOnInit(): void {
  }

}
