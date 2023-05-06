state_path = "{{ .state_path }}"

mqtt {
  host = "{{ .mqtt_host }}"
  port = {{ .mqtt_port }}
  username = "{{ .mqtt_username }}"
  password = "{{ .mqtt_password }}"
}
