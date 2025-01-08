pip install virtualenv
python.exe -m pip install --upgrade pip
virtualenv env
cd env cd scripts actívate
pip install django
python -m django --version
django-admin startproject p001crud
cd .\p001crud\
python manage.py runserver
python manage.py migrate
SQLite Viewer instalar esta extension
python manage.py runserver
python manage.py startapp crud
vamos al archivo models y se crea una clase en singular
en setting agregamos la app que de creo
INSTALLED_APPS
'crud.apps.CrudConfig',
creamos la base de datos en consola
python manage.py makemigrations crud
python manage.py migrate => se crea la tabla crud_task
creamos el superusuario
python manage.py createsuperuser
Username (leave blank to use 'usuario'): 
Email address: jorge@jorge.com
Password:
Password (again):
Superuser created successfully.
python manage.py runserver
ir al archivo admin para hacer visible
 se crea archivo form.py para ingreasar los campos que el usuario se le piden