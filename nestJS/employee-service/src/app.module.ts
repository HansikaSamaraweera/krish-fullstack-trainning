import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { EmployeesModule } from './employees/employees.module';
import { EmployeeController } from './employee/employee.controller';
import { EmployeeController } from './employee/employee.controller';

@Module({
  imports: [EmployeesModule],
  controllers: [AppController, EmployeeController],
  providers: [AppService],
})
export class AppModule {}
