import { Component, OnInit, ChangeDetectionStrategy, ChangeDetectorRef, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { GenericValidator } from 'src/app/common/validator/generic-validator';
import { Subscription } from 'rxjs';
import { repeat } from 'rxjs/operators';
import { Department } from '../department-entity/department';
import { MS002001DetailService } from './ms002001-details.service';


@Component({
  selector: 'app-department-details',
  templateUrl: './ms002001-details.component.html',
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class MS002001DetailsComponent implements OnInit, OnDestroy {
  formData: FormGroup;
  showBreadcumb: boolean;
  showId = true;
  subscription: Subscription;
  displayMessage: { [key: string]: string } = {};
  submitted = false;

  constructor(
    private changDetector: ChangeDetectorRef,
    private fb: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private departmentService: MS002001DetailService
  ) {

    this.formData = this.fb.group({
      deparmentID: ['', ],
      departmentName : ['', [Validators.required, Validators.maxLength(20), Validators.minLength(2), Validators.pattern('')]],
      departmentDescription: [''],
      departmentCode: [, [Validators.required]],
    });
   }
  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  get f() { return this.formData.controls; }
  ngOnInit(): void {
    const id = this.route.snapshot.params.id;
    if (id) {
      this.subscription = this.departmentService.getDetailDepartment(id).subscribe((value: Department) => {
        if (value) {
          // tells Angular that you are now ready for it to run change detection.
          this.changDetector.detectChanges();
          this.formData.patchValue({
             deparmentID: value.deparmentID,
             departmentName: value.departmentName,
             departmentDescription: value.departmentDescription,
             departmentCode: value.departmentCode
          });
        }
      });
      this.showBreadcumb = true;
    } else {
      this.showBreadcumb = false;
    }
   }
   submitForm(value: Department) {
    this.submitted = true;
    console.log('INVALID', this.formData.invalid);
    if (!this.formData.invalid) {
      console.log('Value', value);
      if (value.deparmentID) {
        this.departmentService.updateDepartment(value).subscribe( rep => {
          if (rep) {
            console.log();
          }
        });
      } else {
        this.departmentService.createDepartment(value).subscribe(
          (resp: Response) => {
            if (resp) {
              if (resp.status === 201) {
                this.router.navigate(['/department']);
              }
            }
            console.log('Create Success');
          },
          status => status.sta
        );
      }
    }
   }
}
