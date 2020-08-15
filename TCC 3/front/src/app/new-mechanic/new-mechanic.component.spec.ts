import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { NewMechanicComponent } from './new-mechanic.component';

describe('NewMechanicComponent', () => {
  let component: NewMechanicComponent;
  let fixture: ComponentFixture<NewMechanicComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewMechanicComponent ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(NewMechanicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
